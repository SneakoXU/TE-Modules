-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

INSERT INTO actor (first_name, last_name)
VALUES
        ('Hampton', 'Avenue'), 
        ('Lisa', 'Byway');
       
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.

INSERT INTO film (title, description, release_year, language_id, length)
VALUES ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 198);



-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

BEGIN TRANSACTION;
INSERT INTO film_actor (film_id, actor_id)
VALUES ((SELECT film_id FROM film WHERE title = 'Euclidean PI'), (SELECT actor_id FROM actor WHERE first_name = 'Hampton' AND last_name = 'Avenue')),
       ((SELECT film_id FROM film WHERE title = 'Euclidean PI'), (SELECT actor_id FROM actor WHERE first_name = 'Lisa' AND last_name = 'Byway'));
       
SELECT *
FROM film_actor;       
COMMIT;
-- 4. Add Mathmagical to the category table.

INSERT INTO category (name)
VALUES ('Mathmagical');

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

BEGIN TRANSACTION;
UPDATE film_category
SET category_id = (SELECT category_id FROM category WHERE name = 'Mathmagical')
WHERE film_id IN (SELECT film_id FROM film WHERE title IN( 'Euclidean PI', 'EGG IGBY', 'KARATE MOON', 'RANDOM GO', 'YOUNG LANGUAGE' ));
        
COMMIT;        

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)

BEGIN TRANSACTION;
UPDATE film
SET rating = 'G'
FROM film_category
WHERE  film.film_id = film_category.film_id AND
film_category.category_id = (SELECT category_id FROM category WHERE name = 'Mathmagical');
        
COMMIT; 
                                             

-- 7. Add a copy of "Euclidean PI" to all the stores.
BEGIN TRANSACTION;
INSERT INTO inventory (film_id, store_id)
SELECT (SELECT film_id FROM film WHERE title = 'Euclidean PI'), store_id
FROM store;

SELECT *
FROM inventory
        JOIN film f
                ON inventory.film_id = f.film_id
WHERE f.title = 'Euclidean PI';                
ROLLBACK;


-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)

--DELETE does not work because it violates the foreign key constraint in the film_actor table
BEGIN TRANSACTION;
DELETE FROM film
WHERE title = 'Euclidean PI';
ROLLBACK;

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)

-- DELETE does not work b/c it violates the foreign key constraint in the film_category table
BEGIN TRANSACTION;
DELETE FROM category
WHERE name = 'Mathmagical';
ROLLBACK;

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)

-- It succeeded b/c it did not violate any constraint. There is no constraint on deleting it from the film_category table, it's reference in the category table still exists

BEGIN TRANSACTION;
DELETE FROM film_category
WHERE category_id IN (SELECT category_id FROM category WHERE name = 'Mathmagical');
ROLLBACK;

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)

-- Deleting Mathmagical from the category table works b/c there is no longer a foreign key constraint in the film_category table since all references of the category were removed from film_category

BEGIN TRANSACTION;
DELETE FROM category
WHERE name = 'Mathmagical';
ROLLBACK;

-- Deleting Euclidean from film table does not work since the constraint still exists
BEGIN TRANSACTION;
DELETE FROM film
WHERE title = 'Euclidean PI';
ROLLBACK;


-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.

-- All references will need to be deleted from the following tables first: film_actor, film_category and inventory_film
SELECT * FROM INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS WHERE constraint_name LIKE '%film_id%';
