
## API Reference

#### The app defines following CRUD APIs.

| Method    | Url                       | Description                   | 
| :-------- | :-------                  | :-------------------------    |
| `GET `    | `api/movie`               | Get all movies                |
| `POST `   | `api/movie/create`        | Create  movies                |
| `GET `    | `api/movie/detail/{id}`   | Get     movies by id          |
| `PUT `    | `api/movie/update/{id}`   | Update  movies                |
| `DELETE ` | `api/movie/delete/{id}`   | Delete  movies by id          |

You can test them using postman or any other rest client.


## Sample Valid JSON Request Bodys

#### POST    - api/movie/create
```
Request :

{
    "title": "Pengabdi Setan 4",
    "description": "Pengabdi Setan 4 Description",
    "rating": 5.0,
    "image":""
}

Response :
{
    "id": 2205,
    "title": "Pengabdi Setan 4",
    "description": "Pengabdi Setan 4 Description",
    "rating": 5.0,
    "image": "",
    "created_at": "2024-03-25 05:06:10",
    "updated_at": "2024-03-25 05:06:10"
}
```

#### GET    - api/movie
```
Response :
[
    {
        "id": 2202,
        "title": "Pengabdi Setan 1",
        "description": "Pengabdi Setan 1 Description",
        "rating": 5.0,
        "image": "",
        "created_at": "2024-03-25 05:03:29",
        "updated_at": "2024-03-25 05:03:29"
    },
    {
        "id": 2203,
        "title": "Pengabdi Setan 2",
        "description": "Pengabdi Setan 2 Description",
        "rating": 5.0,
        "image": "",
        "created_at": "2024-03-25 05:04:09",
        "updated_at": "2024-03-25 05:04:09"
    },
    {
        "id": 2204,
        "title": "Pengabdi Setan 3",
        "description": "Pengabdi Setan 3 Description Update",
        "rating": 5.0,
        "image": "",
        "created_at": "2024-03-25 05:04:19",
        "updated_at": "2024-03-25 05:05:29"
    }
]
```
#### GET   - api/movie/detail/{id}
```
Response :
{
    "id": 2204,
    "title": "Pengabdi Setan 3",
    "description": "Pengabdi Setan 3 Description",
    "rating": 5.0,
    "image": "",
    "created_at": "2024-03-25 05:04:19.746932",
    "updated_at": "2024-03-25 05:04:19.746932"
}
```
#### PUT   - api/movie/update/{id}
```
Resquest :
{
"title": "Pengabdi Setan 3",
"description": "Pengabdi Setan 3 Description Update",
"rating": 5.0,
"image":""
}

Response :
{
    "id": 2204,
    "title": "Pengabdi Setan 3",
    "description": "Pengabdi Setan 3 Description Update",
    "rating": 5.0,
    "image": "",
    "created_at": "2024-03-25 05:04:19.746932",
    "updated_at": "2024-03-25 05:05:29.711697"
}
```
#### DELETE   - api/movie/delete/{id}
```

"Movie deleted successfully!"

```
#### Validation Message & Exception
```
Request :
{
    "title": "",
    "description": "",
    "rating": 10,
    "image":""
}

Response :
{
    "timeStamp": "2024-03-25T05:24:41.8479396",
    "errorMessage": [
        "Description must be at least 10 characters long",
        "Rating must be less than or equal to 5",
        "title is mandatory",
        "title is mandatory",
        "description is mandatory",
        "description is mandatory",
        "Title must be at least 1 character long"
    ],
    "status": "BAD_REQUEST",
    "statusCode": 400
}
```
```
{
	errormessage: "This movie already exists!"
}
```
```
{
    "errormessage": "Movie not found with id: 125"
}
```
