// 1
MATCH (darj:town { name: "Darjeeling" }), (sand:peak { name: "Sandakphu" })
MATCH path = ShortestPath((darj)-[*]->(sand))
RETURN path


// 2
MATCH (darj:town { name: "Darjeeling" }), (sand:peak { name: "Sandakphu" })
MATCH path = ShortestPath((darj)-[*]->(sand))
WHERE ALL (r IN relationships(path) WHERE r.winter = "true")
RETURN path


// 3.1
// tekstowo
MATCH path = (darj:town { name: "Darjeeling" })-[rels*..5]->(sand:peak { name: "Sandakphu" })
RETURN [r IN relationships(path) | r.name + ": " + type(r)], REDUCE(d = 0, r IN rels | d + r.distance) AS total_dist
ORDER BY total_dist

// z grafem (return path)
MATCH path = (darj:town { name: "Darjeeling" })-[rels*..5]->(sand:peak { name: "Sandakphu" })
RETURN path, REDUCE(d = 0, r IN rels | d + r.distance) AS total_dist
ORDER BY total_dist

// 3.2
MATCH path = (darj:town { name: "Rimbik" })-[:twowheeler*]->(miejsce)
WHERE ALL (r IN relationships(path) WHERE r.summer = 'true')
RETURN darj,path


// 4
MATCH (a:Airport)
RETURN a
ORDER BY a.name


// 5
MATCH (t:Ticket)-[:ASSIGN]->(f:Flight)-[:ORIGIN]->(o:Airport { name: "LAX" })
WITH o, f, t
MATCH (f)-[:DESTINATION]->(d:Airport)
RETURN o,f,t,d
