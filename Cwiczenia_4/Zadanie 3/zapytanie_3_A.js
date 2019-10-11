printjson(
    db.people.aggregate([
        {
            $group: {
                _id: null,
                job: { $addToSet: "$job" }
            }
        },
        {
            $unwind: "$job"
        },
        {
            $project: {
                _id: 0
            }
        },
		{ 
			$sort: { job: 1 } 
		}
    ])
    .toArray()
);



// drugie rozwiązanie
// printjson(
//     db.people.aggregate([
//         {
//             $group: {
//                 _id: "$job",
//                 jobs: { $sum: 1 }
//             }
//         },
// 		{
// 			$project: {
// 				jobs: 0
// 			}
// 		},
// 		{ 
// 			$sort: { _id: 1 } 
// 		}
//     ])
//     .toArray()
// );