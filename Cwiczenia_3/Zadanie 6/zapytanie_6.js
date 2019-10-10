//6
printjson(db.people.insertOne( 
    { "sex":"Male","first_name":"Maciej","last_name":"Sadoś","job":"Programmer","email":"s14051@pjwstk.edu.pl","location":{"city":"Some city","address":{"streetname":"Some street","streetnumber":"22"}},"description":"MongoDB jest fajne","height":"177","weight":"68","birth_date":"1996-09-28","nationality":":Poland","credit":[ {"type":"visa-electron","number":"2222222222222222","currency":"PLN","balance":"1000000000000000"} ]}
));

printjson(db.people.find( { first_name: "Maciej" } ).toArray());