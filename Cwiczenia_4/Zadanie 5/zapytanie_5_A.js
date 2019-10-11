printjson(
    db.people.aggregate([
        {
            $match: { sex: "Female", nationality: "Poland" }
        },
        {
            $unwind: "$credit"
        },
        {
            $group: {
                _id: "$credit.currency",
                "Średnia ilość środków": { $sum: { $toDouble: "$credit.balance" } },
                "łączne środki na karcie": { $avg: { $toDouble: "$credit.balance" } },
            }
        },
        {
            $project: {
                _id: 0,
                waluta: "$_id",
                "Średnia ilość środków": 1,
                "łączne środki na karcie": 1
            }
        },
		{
			$sort: { waluta: 1 } 
		}
    ])
    .toArray()
);