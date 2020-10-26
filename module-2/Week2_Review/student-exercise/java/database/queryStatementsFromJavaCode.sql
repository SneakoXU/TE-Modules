SELECT s.site_id FROM site s LEFT OUTER JOIN reservation r ON s.site_id = r.site_id JOIN campground c ON s.campground_id = c.campground_id JOIN park p ON c.park_id = p.park_id WHERE r.site_id IS NULL;

SELECT r.reservation_id, r.site_id, r.name, r.from_date AS start_date, r.to_date AS end_date, r.create_date 
FROM reservation r 
        JOIN site s ON r.site_id = s.site_id
        JOIN campground c ON s.campground_id = c.campground_id
        JOIN park p ON c.park_id = p.park_id
WHERE r.from_date BETWEEN CURRENT_DATE AND CURRENT_DATE + INTERVAL '30 days';       


SELECT s.site_id, p.park_id
FROM site s
        JOIN reservation r ON s.site_id = r.reservation_id
        JOIN campground c ON s.campground_id = c.campground_id
        JOIN park p ON c.park_id = p.park_id;
--WHERE r.from_date = CURRENT_DATE + INTERVAL '3 days' AND r.to_date = CURRENT_DATE + INTERVAL '5 days';        