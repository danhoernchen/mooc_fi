# Write your solution here
def find_movies(database: list, search_term: str):
    result = []
    for movie in database:
        print(movie["name"])
        if search_term.lower() in movie["name"].lower():
            result.append(movie)
    return result

