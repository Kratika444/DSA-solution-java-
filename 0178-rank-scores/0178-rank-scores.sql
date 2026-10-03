select score,
       DENSE_RANK() OVER(order by score DESC) AS 'rank'
    From Scores ;