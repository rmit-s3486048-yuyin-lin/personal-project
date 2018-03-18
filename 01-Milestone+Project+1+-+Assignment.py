
# coding: utf-8

# # Milestone Project 1
# ## Congratulations on making it to your first milestone!
# You've already learned a ton and are ready to work on a real project.
# 
# Your assignment: Create a Tic Tac Toe game. You are free to use any IDE you like.
# 
# Here are the requirements:
# 
# * 2 players should be able to play the game (both sitting at the same computer)
# * The board should be printed out every time a player makes a move
# * You should be able to accept input of the player position and then place a symbol on the board
# 
# Feel free to use Google to help you figure anything out (but don't just Google "Tic Tac Toe in Python" otherwise you won't learn anything!) Keep in mind that this project can take anywhere between several hours to several days.
# 
# There are 4 Jupyter Notebooks related to this assignment:
# 
# * This Assignment Notebook
# * A "Walkthrough Steps Workbook" Notebook
# * A "Complete Walkthrough Solution" Notebook
# * An "Advanced Solution" Notebook
# 
# I encourage you to just try to start the project on your own without referencing any of the notebooks. If you get stuck, check out the next lecture which is a text lecture with helpful hints and steps. If you're still stuck after that, then check out the Walkthrough Steps Workbook, which breaks up the project in steps for you to solve. Still stuck? Then check out the Complete Walkthrough Solution video for more help on approaching the project!

# There are parts of this that will be a struggle...and that is good! I have complete faith that if you have made it this far through the course you have all the tools and knowledge to tackle this project. Remember, it's totally open book, so take your time, do a little research, and remember:
# 
# ## HAVE FUN!

# In[60]:





# In[3]:





# In[1]:


import random

def placeMarker(board, marker, location):
    if location == 1:
        board[1] = marker
    elif location == 2:
        board[2] = marker
    elif location == 3:
        board[3] = marker
    elif location == 4:
        board[4] = marker
    elif location == 5:
        board[5] = marker
    elif location == 6:
        board[6] = marker
    elif location == 7:
        board[7] = marker
    elif location == 8:
        board[8] = marker
    elif location == 9:
        board[9] = marker

def playerInput():
    marker = ''
    check = False
    
    while marker != 'X' and marker != 'O':
        marker = raw_input('Player 1: Do you want to be X or O? ')

    player1 = marker
    
    if player1 == 'X':
        player2 = 'O'
    else:
        player2 = 'X'
    return (player1, player2)

def chooseFirst():
    number = random.randint(1,2)
    if(number == 1):
        print 'Player 1 will go first'
        return number
    elif(number == 2):
        print 'Player 2 will go first'
        return number
    
def displayBoard(board):
    print(' ' + ' | ' + ' ' + ' | ' + ' ')
    print(board[1] + ' | ' + board[2] + ' | ' + board[3])
    print(' ' + ' | ' + ' ' + ' | ' + ' ')
    print('---------')
    print(' ' + ' | ' + ' ' + ' | ' + ' ')
    print(board[4] + ' | ' + board[5] + ' | ' + board[6])
    print(' ' + ' | ' + ' ' + ' | ' + ' ')
    print('---------')
    print(' ' + ' | ' + ' ' + ' | ' + ' ')
    print(board[7] + ' | ' + board[8] + ' | ' + board[9])
    print(' ' + ' | ' + ' ' + ' | ' + ' ')

def winCheck(board, marker):
    if (board[1] == board[2] == board[3]== marker) :
        return True
    elif (board[4] == board[5] == board[6]== marker) :
        return True
    elif (board[7] == board[8] == board[9]== marker) :
        return True
    elif (board[1] == board[4] == board[7]== marker) :
        return True
    elif (board[2] == board[5] == board[8]== marker) :
        return True
    elif (board[3] == board[6] == board[9]== marker) :
        return True
    elif (board[1] == board[5] == board[9]== marker) :
        return True
    elif (board[7] == board[5] == board[3]== marker) :
        return True
    else:
        return False

def spaceCheck(board, position):
    return board[position] == ' '
    
def replay():
    choice = ' '
    while choice != 'Yes' and choice != 'No':
        choice = raw_input('Do you want to play the game again?')
        if(choice == 'Yes'):
            return True
        elif(choice == 'No'):
            return False

def fullBoardCheck(board):
    for i in range(1,10):
        if spaceCheck(board, i):
            return False
    return True
            
def playerChoice(board):
    check = False
    while(check == False):
        position = input('Please enter a position')
        if(spaceCheck(board, position) == True):
            return position
            check = True
        else:
            print 'Invalid position, please re-enter!'
        

#main function section below
def main():
    restart = True
    while(restart == True):
        boardOne = [' ',' ',' ',' ',' ',' ',' ',' ',' ',' ']
        mark = ''
        gameEnd = False
        print 'Welcome to Tic Tac Toe!'
        player1, player2 = playerInput()
        turn = chooseFirst()

        if(turn == 1):
            mark = player1
        elif(turn == 2):
            mark = player2

        while(gameEnd == False):
            #player one turn
            if(mark == player1):
                pos = playerChoice(boardOne)
                placeMarker(boardOne, mark, pos)
                displayBoard(boardOne)
                if(winCheck(boardOne, mark) == True):
                    if(mark == player1):
                        print 'Player one has won!!'
                        gameEnd = True
                    elif(mark == player2):
                        print 'Player two has won!!'
                        gameEnd = True
                else:
                    if(fullBoardCheck(boardOne) == True):
                        displayBoard(boardOne)
                        print 'The game is a draw'
                        gameEnd = True
                    else:
                        mark = player2
            else:
            #player two turn
                pos = playerChoice(boardOne)
                placeMarker(boardOne, mark, pos)
                displayBoard(boardOne)
                if(winCheck(boardOne, mark) == True):
                    if(mark == player1):
                        print 'Player one has won!!'
                        gameEnd = True
                    elif(mark == player2):
                        print 'Player two has won!!'
                        gameEnd = True
                else:
                    if(fullBoardCheck(boardOne) == True):
                        displayBoard(boardOne)
                        print 'The game is a draw'
                        gameEnd = True
                    else:
                        mark = player1

        if(replay() == False):
            restart = False
        else:
            print 'Restarting game'

    #end main function


# In[ ]:





# In[3]:




