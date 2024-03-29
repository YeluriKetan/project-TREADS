SELECT
    activity_date AS day,
    COUNT(DISTINCT user_id) AS active_users
FROM
    Activity
WHERE
    activity_date BETWEEN SUBDATE('2019-07-27', 29) AND '2019-07-27'
GROUP BY
    activity_date