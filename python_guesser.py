import random 

# computer chooses number 
secretNumber = random.randint(1,99)

# get player number
playerName = input("Hello what is your name? ")

# user guesses a number 
guess = int(input("I'm thinking of a number between 1 and 99\nYou have 7 tries, guess a number: "))
numberOfGuesses = 1

# check if guess is correct 
while numberOfGuesses < 7:
    if guess < secretNumber:
        print("Your guess is too low!")
        guess = int(input("Guess a number between 1 and 99: "))
    if guess > secretNumber:
        print("Your guess is too high!")
        guess = int(input("Guess a number between 1 and 99: "))
    if guess == secretNumber:
        break
    numberOfGuesses += 1
    
if guess == secretNumber:
    print("Congrats " + playerName + " you guessed it!\nIt took you " + str(numberOfGuesses) + " guesses")

if guess != secretNumber:
    print("Sorry " + playerName + " you lost. The number I was thinking of was " + str(secretNumber))
        

    

