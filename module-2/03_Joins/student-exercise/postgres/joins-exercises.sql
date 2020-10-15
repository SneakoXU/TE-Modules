-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)

SELECT *
FROM actor a
        JOIN film_actor fa
                ON a.actor_id = fa.actor_id
                        JOIN film f
                                ON fa.film_id = f.film_id
WHERE a.actor_id = 44;                        

-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)

SELECT *
FROM actor a
        JOIN film_actor fa
                ON a.actor_id = fa.actor_id
                        JOIN film f
                                ON fa.film_id = f.film_id
WHERE a.actor_id = 135;   

-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)

SELECT *
FROM actor a
        JOIN film_actor fa
                ON a.actor_id = fa.actor_id
                        JOIN film f
                                ON fa.film_id = f.film_id
WHERE a.actor_id = 35 OR a.actor_id = 143;   


-- 4. All of the the ‘Documentary’ films
-- (68 rows)

SELECT *
FROM film f
        JOIN film_category fc
                ON f.film_id = fc.film_id
                        JOIN category c
                                ON fc.category_id = c.category_id
WHERE c.name = 'Documentary';                                

-- 5. All of the ‘Comedy’ films
-- (58 rows)

SELECT *
FROM film f
        JOIN film_category fc
                ON f.film_id = fc.film_id
                        JOIN category c
                                ON fc.category_id = c.category_id
WHERE c.name = 'Comedy'; 

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)

SELECT *
FROM film f
        JOIN film_category fc
                ON f.film_id = fc.film_id
                        JOIN category c
                                ON fc.category_id = c.category_id
WHERE c.name = 'Children' AND f.rating = 'G'; 

-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)

SELECT *
FROM film f
        JOIN film_category fc
                ON f.film_id = fc.film_id
                        JOIN category c
                                ON fc.category_id = c.category_id
WHERE c.name = 'Family' AND f.rating = 'G' AND f.length < 120; 

-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)

SELECT *
FROM actor a
        JOIN film_actor fa
                ON a.actor_id = fa.actor_id
                        JOIN film f
                                ON fa.film_id = f.film_id
WHERE a.actor_id = 103 AND f.rating = 'G';                                


-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)

SELECT *
FROM film f
        JOIN film_category fc
                ON f.film_id = fc.film_id
                        JOIN category c
                                ON fc.category_id = c.category_id
WHERE c.name = 'Sci-Fi' AND f.release_year = '2006';                                 


-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)

SELECT *
FROM actor a
        JOIN film_actor af
                ON a.actor_id = af.actor_id
                        JOIN film f 
                                ON af.film_id = f.film_id
                                        JOIN film_category fc
                                                ON f.film_id = fc.film_id
                                                        JOIN category c
                                                                ON fc.category_id = c.category_id
WHERE a.actor_id = 44 AND c.name = 'Action';                                        

-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)

SELECT a.address, cty.city, a.district, c.country
FROM store s 
        JOIN address a 
                ON s.address_id = a.address_id
                        JOIN city cty
                                ON a.city_id = cty.city_id
                                        JOIN country c
                                                ON cty.country_id = c.country_id;
                                                
                     

-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)

SELECT a.address, st.first_name, st.last_name
FROM store s
        RIGHT JOIN staff st
                ON s.store_id = st.store_id
                        JOIN address a
                                ON st.address_id = a.address_id;
           

-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT�? with 46 rentals, #10 should have 39 rentals)

SELECT c.first_name, c.last_name, COUNT(*)
FROM customer c
        LEFT JOIN rental r
                ON c.customer_id = r.customer_id
                        JOIN payment p
                                ON r.rental_id = p.rental_id
GROUP BY c.last_name, c.first_name
ORDER BY count(*) DESC LIMIT 10;
                               

-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL�? with 221.55 spent, #10 should be “ANA BRADLEY�? with 174.66 spent)

SELECT c.first_name, c.last_name, SUM(amount)
FROM payment p
        RIGHT JOIN customer c
                ON p.customer_id = c.customer_id
GROUP BY c.customer_id
ORDER BY SUM(amount) DESC LIMIT 10;               

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store.
-- (NOTE: Keep in mind that an employee may work at multiple stores.)
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)

SELECT s.store_id, a.address, count(r.rental_id) AS number_of_rentals, sum(p.amount) AS total_amount_of_sales, avg(p.amount) AS avg_sale
FROM store s
        JOIN address a
                ON s.address_id = a.address_id
        JOIN inventory i
                ON s.store_id = i.store_id
                        JOIN rental r 
                                ON i.inventory_id = r.inventory_id
                                        JOIN payment p
                                                ON r.rental_id = p.rental_id
GROUP BY s.store_id, a.address;                                                                  

-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD�? with 34 rentals and #10 should have 31 rentals)

SELECT f.title, count(rental_id)
FROM film f
        JOIN inventory i
                ON f.film_id = i.film_id
                        JOIN rental r
                                ON i.inventory_id = r.inventory_id
GROUP BY f.title
ORDER BY count(rental_id) DESC LIMIT 10;                                

-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports�? with 1179 rentals and #5 should be “Family�? with 1096 rentals)

SELECT c.name, count(*)
FROM category c
        JOIN film_category fc
                ON c.category_id = fc.category_id
                        JOIN film f
                                ON fc.film_id = f.film_id
                                        JOIN inventory i
                                                ON f.film_id = i.film_id
                                                        JOIN rental r
                                                                ON i.inventory_id = r.inventory_id
GROUP BY c.name 
ORDER BY count(*) DESC LIMIT 5;                                                               

-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)


SELECT f.title, count(*)
FROM category c
        JOIN film_category fc
                ON c.category_id = fc.category_id
                        JOIN film f
                                ON fc.film_id = f.film_id
                                        JOIN inventory i
                                                ON f.film_id = i.film_id
                                                        JOIN rental r
                                                                ON i.inventory_id = r.inventory_id
WHERE c.name = 'Action'                                                                
GROUP BY f.title 
ORDER BY count(*) DESC LIMIT 5;    

-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES�? with 753 rentals and #10 should be “SEAN GUINESS�? with 599 rentals)

SELECT a.first_name, a.last_name, count(*)
FROM actor a
        JOIN film_actor fa
                ON a.actor_id = fa.actor_id
                        JOIN film f
                                ON fa.film_id = f.film_id
                                        JOIN inventory i 
                                                ON f.film_id = i.film_id
                                                        JOIN rental r
                                                                ON i.inventory_id = r.inventory_id
GROUP BY a.actor_id
ORDER BY count(*) DESC LIMIT 10;                                                                

-- 20. The top 5 “Comedy�? actors ranked by number of rentals of films in the “Comedy�? category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)

SELECT a.first_name, a.last_name, count(rental_id) AS num_of_rentals
FROM actor a
        JOIN film_actor fa
                ON a.actor_id = fa.actor_id
                        JOIN film f
                                ON fa.film_id = f.film_id
                                        JOIN film_category fc
                                                ON f.film_id = fc.film_id
                                                        JOIN category c
                                                                ON fc.category_id = c.category_id
                                                        JOIN inventory i
                                                                ON fc.film_id = i.film_id
                                                                        JOIN rental r
                                                                ON i.inventory_id = r.inventory_id
WHERE c.name = 'Comedy'
GROUP BY a.last_name, a.first_name
ORDER BY num_of_rentals DESC LIMIT 5;                                                                        
                                                      
                                                        
                                        
