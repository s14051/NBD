//3 
printjson(db.people.find( { sex: "Male", nationality: "Germany" } ).toArray());