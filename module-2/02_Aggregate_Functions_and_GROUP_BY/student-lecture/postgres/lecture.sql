-- ORDERING RESULTS

-- Populations of all countries in descending order

SELECT population, name
FROM country
ORDER BY population DESC;

--Names of countries and continents in ascending order

SELECT name, continent
FROM country
ORDER BY name;

-- LIMITING RESULTS
-- The name and average life expectancy of the countries with the 10 highest life expectancies.

SELECT name, lifeexpectancy
FROM country
WHERE lifeexpectancy IS NOT NULL
ORDER BY lifeexpectancy DESC
LIMIT 10;

-- CONCATENATING OUTPUTS

-- The name & state of all cities in California, Oregon, or Washington.
-- "city, state", sorted by state then city

SELECT name || ', ' || district AS citystate
FROM city
WHERE countrycode = 'USA' AND (district = 'California' OR district = 'Oregon' OR district = 'Washington')
ORDER BY district, city;

/* OR YOU CAN DO THIS BELOW (which is preferred): */

SELECT name || ', ' || district AS citystate FROM city WHERE countrycode = 'USA' AND district IN ('California', 'Oregon', 'Washington') ORDER BY district, city;

-- AGGREGATE FUNCTIONS
-- Average Life Expectancy in the World

SELECT 'World' AS Category, avg(lifeexpectancy) AS avg_life_expectancy
FROM country;

-- Total population in Ohio

SELECT district, sum(population)
FROM city
WHERE district = 'Ohio'
GROUP BY district;

-- The surface area of the smallest country in the world

SELECT MIN(surfacearea) as smallest_surface_area -- We can't include name b/c it would require a GROUP BY clause and break the MIN (returns min for each country which is not correct)
FROM country;

/* HOWEVER ... */

SELECT name, surfacearea as smallest_surface_area
FROM country
WHERE surfacearea = (SELECT MIN(surfacearea) FROM country); -- the sub query asks where the name and surface area intersect

/* ANOTHER WAY BUT NOT AS DIRECT */

SELECT name, surfacearea FROM country ORDER BY surfacearea ASC LIMIT 1;


-- The 10 largest countries in the world

SELECT name
FROM country
ORDER BY surfacearea DESC LIMIT 10;

-- The number of countries who declared independence in 1991

SELECT count(*)
FROM country
WHERE indepyear = 1991;

-- GROUP BY
-- Count the number of countries where each language is spoken, ordered from most countries to least

SELECT language, count(*) as lang_count
FROM countrylanguage
GROUP BY language
ORDER BY lang_count DESC;

-- Average life expectancy of each continent ordered from highest to lowest

SELECT continent, AVG(lifeexpectancy) as life_expectancy
FROM country
WHERE continent <> 'Antarctica'
GROUP BY continent
ORDER BY life_expectancy DESC;


-- Exclude Antarctica from consideration for average life expectancy

-- Sum of the population of cities in each state in the USA ordered by state name

-- The average population of cities in each state in the USA ordered by state name

-- SUBQUERIES
-- Find the names of cities under a given government leader

SELECT c.name FROM city c WHERE c.countrycode IN (SELECT code FROM country WHERE headofstate LIKE '%Elisabeth%');

-- Find the names of cities whose country they belong to has not declared independence yet

SELECT name, countrycode FROM city WHERE countrycode IN (SELECT code FROM country WHERE indepyear IS NULL);

-- Additional samples
-- You may alias column and table names to be more descriptive

-- Alias can also be used to create shorthand references, such as "c" for city and "co" for country.

-- Ordering allows columns to be displayed in ascending order, or descending order (Look at Arlington)

-- Limiting results allows rows to be returned in 'limited' clusters,where LIMIT says how many, and OFFSET (optional) specifies the number of rows to skip

SELECT * FROM city ORDER BY population DESC;

SELECT * FROM city ORDER BY population DESC LIMIT 10;

SELECT * FROM city ORDER BY population DESC LIMIT 10 OFFSET 3; --shifts top ten list down by three rows, the top ten outside of the top 3

-- Most database platforms provide string functions that can be useful for working with string data. In addition to string functions, string concatenation is also usually supported, which allows us to build complete sentences if necessary.

-- Aggregate functions provide the ability to COUNT, SUM, and AVG, as well as determine MIN and MAX. Only returns a single row of value(s) unless used with GROUP BY.

-- Counts the number of rows in the city table

-- Also counts the number of rows in the city table

-- Gets the SUM of the population field in the city table, as well as
-- the AVG population, and a COUNT of the total number of rows.

-- Gets the MIN population and the MAX population from the city table.



-- Using a GROUP BY with aggregate functions allows us to summarize information for a specific column. For instance, we are able to determine the MIN and MAX population for each countrycode in the city table.
