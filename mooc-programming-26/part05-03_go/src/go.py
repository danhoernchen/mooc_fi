# Write your solution here
def who_won(gameboard: list):
    player_one = 0
    player_two = 0
    for row in gameboard:
        for field in row:
            if field == 1:
                player_one += 1
            elif field == 2:
                player_two += 1
    if player_one == player_two:
        return 0
    else:
        return 1 if player_one > player_two else 2

