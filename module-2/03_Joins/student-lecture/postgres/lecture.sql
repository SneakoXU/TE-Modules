-- ********* INNER JOIN ***********

-- Let's find out who made payment 16666:

SELECT * FROM payment WHERE payment_id = 16666;



-- Ok, that gives us a customer_id, but not the name. We can use the customer_id to get the name FROM the customer table

SELECT *
FROM customer c JOIN
payment p ON c.customer_id = p.customer_id
WHERE p.payment_id = 16666;


-- We can see that the * pulls back everything from both tables. We just want everything from payment and then the first and last name of the customer:

SELECT c.first_name, c.last_name, p.*
FROM customer c JOIN
payment p ON c.customer_id = p.customer_id
WHERE p.payment_id = 16666;

-- But when did they return the rental? Where would that data come from? From the rental table, so let’s join that.

SELECT c.first_name, c.last_name, p.*, r.*
FROM customer c 
JOIN payment p 
        ON c.customer_id = p.customer_id 
JOIN rental r 
        ON p.rental_id = r.rental_id
WHERE p.payment_id = 16666;

-- What did they rent? Film id can be gotten through inventory.

SELECT c.first_name, c.last_name, p.*, r.*, f.*
FROM customer c 
JOIN payment p 
        ON c.customer_id = p.customer_id 
JOIN rental r 
        ON p.rental_id = r.rental_id
        JOIN inventory i
                ON r.inventory_id = i.inventory_id
                JOIN film f
                        ON i.film_id = f.film_id
WHERE p.payment_id = 16666;

-- What if we wanted to know who acted in that film?

SELECT f.title, a.*
FROM customer c 
JOIN payment p 
        ON c.customer_id = p.customer_id 
JOIN rental r 
        ON p.rental_id = r.rental_id
        JOIN inventory i
                ON r.inventory_id = i.inventory_id
                JOIN film f
                        ON i.film_id = f.film_id
                        JOIN film_actor fa
                                ON f.film_id = fa.film_id
                                JOIN actor a
                                        ON fa.actor_id = a.actor_id
WHERE p.payment_id = 16666;

-- What if we wanted a list of all the films and their categories ordered by film title



-- Show all the 'Comedy' films ordered by film title

-- Finally, let's count the number of films under each category

-- ********* LEFT JOIN ***********

-- (There aren't any great examples of left joins in the "dvdstore" database, so the following queries are for the "world" database)

-- A Left join, selects all records from the "left" table and matches them with records from the "right" table if a matching record exists.

-- Let's display a list of all countries and their capitals, if they have some.

SELECT c.name AS Country, cty.name AS Capital
FROM country c
JOIN city cty
        ON cty.id = c.capital;

-- Only 232 rows
-- But we’re missing entries:

-- There are 239 countries. So how do we show them all even if they don’t have a capital?
-- That’s because if the rows don’t exist in both tables, we won’t show any information for it. If we want to show data FROM the left side table everytime, we can use a different join:

SELECT c.name AS Country, cty.name AS Capital
FROM country c
        LEFT JOIN city cty
                ON cty.id = c.capital;

-- *********** UNION *************

-- Back to the "dvdstore" database...

-- Gathers a list of all first names used by actors and customers
-- By default removes duplicates

SELECT first_name FROM actor
UNION
SELECT first_name FROM customer
ORDER BY first_name;

-- Gather the list, but this time note the source table with 'A' for actor and 'C' for customer

SELECT first_name, 'A' AS Source  FROM actor
UNION
SELECT first_name, 'C' AS Source FROM customer
ORDER BY first_name;

-- Gather a list of all names using union

SELECT first_name, 'A' AS Source  FROM actor
UNION ALL
SELECT first_name, 'C' AS Source FROM customer
ORDER BY first_name;


