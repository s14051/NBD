//5
printjson(db.people.find( { birth_date: { $gte: "2001-01-01T00:00:00Z" } }, { first_name: 1, last_name: 1, "location.city": 1, _id: 0 } ).toArray());