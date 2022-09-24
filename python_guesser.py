import random 

# computer chooses number 
secretNumber = random.randint(1,99)

# user guesses a number 
guess = int(input("Guess a number between 1 and 99: "))

# check if guess is correct 
while guess != secretNumber:
    if guess < secretNumber:
        print("Your guess is too low!")
        guess = int(input("Guess a number between 1 and 99: "))
    if guess > secretNumber:
        print("Your guess is too high!")
        guess = int(input("Guess a number between 1 and 99: "))
    else:
        print("Congrats you guessed it!")
        break
    
        

    

