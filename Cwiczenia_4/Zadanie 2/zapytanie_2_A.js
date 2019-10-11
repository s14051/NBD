printjson(
    db.people.aggregate([
        {
            $unwind: "$credit"
        },
        {
            $group: {
                _id: "$credit.currency",
                "łączne środki na karcie": { $sum: { $toDouble: "$credit.balance" } }
            }
        },
        {
            $project: {
                _id: 0,
                waluta: "$_id",
                "łączne środki na karcie": 1
            }
        }
    ])
    .toArray()
);