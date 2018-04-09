
# coding: utf-8

# # Milestone Project 2 - Blackjack Game
# In this milestone project you will be creating a Complete BlackJack Card Game in Python.
# 
# Here are the requirements:
# 
# * You need to create a simple text-based [BlackJack](https://en.wikipedia.org/wiki/Blackjack) game
# * The game needs to have one player versus an automated dealer.
# * The player can stand or hit.
# * The player must be able to pick their betting amount.
# * You need to keep track of the player's total money.
# * You need to alert the player of wins, losses, or busts, etc...
# 
# And most importantly:
# 
# * **You must use OOP and classes in some portion of your game. You can not just use functions in your game. Use classes to help you define the Deck and the Player's hand. There are many right ways to do this, so explore it well!**
# 
# 
# Feel free to expand this game. Try including multiple players. Try adding in Double-Down and card splits! Remember to you are free to use any resources you want and as always:
# 
# # HAVE FUN!

# In[8]:


import random

suits = ('Hearts', 'Diamonds', 'Spades', 'Clubs')
ranks = ('Two', 'Three', 'Four', 'Five', 'Six', 'Seven', 'Eight', 'Nine', 'Ten', 'Jack', 'Queen', 'King', 'Ace')
values = {'Two':2, 'Three':3, 'Four':4, 'Five':5, 'Six':6, 'Seven':7, 'Eight':8, 'Nine':9, 'Ten':10, 'Jack':10,
         'Queen':10, 'King':10, 'Ace':11}

class Card:
    def __init__(self, suit, rank):
        self.suit = suit
        self.rank = rank
        
    def __str__(self):
        return(self.rank + ' of '+ self.suit)

class Deck:
    def __init__(self):
        self.deck = []
        for suit in suits:
            for rank in ranks:
                self.deck.append(Card(suit, rank))
                
    def __str__(self):
        showCard = ''
        for card in self.deck:
            showCard += '\n' + card.__str__()
        return showCard
    #ask pancetta
    def shuffle(self):
        random.shuffle(self.deck)
        
    def deal(self):
        aCard = self.deck.pop()
        return aCard

class Hand:
    def __init__(self):
        self.cards = []
        self.value = 0
        self.aces = 0
    
    def addCard(self, card):
        self.cards.append(card)
        self.value += values[card.rank]
        
        #adds count to aces
        if(card.rank == 'Ace'):
            self.aces += 1
        
    def adjustForAce(self):
        if(self.aces >= 1):
            if(self.value > 21):
                self.value -= 10
                self.aces -= 1
                
class Chips:
    def __init__(self):
        self.total = 100
        self.bet = 0
    
    def winBet(self):
        self.total += self.bet
    
    def loseBet(self):
        self.bet -= self.bet

def takeBet():
    complete = False
    while(complete == False):
        try:
            bet = input('Select chips to bet with!')
            if(bet > 100):
                print 'Invalid input, please input a numerical value between 1-100!'
                complete = False
            elif(bet == 0):
                print 'Invalid input, please input a numerical value between 1-100!'
                complete = False
            else:
                return bet
                complete = True
        except:
            print 'Invalid input, please input a numerical value between 1-100!'

def hit(deck, hand):
    newCard = deck.deal()
    hand.append(newCard)
    hand.adjustForAce()
    
def hitOrStand(deck, hand):
    global playing
    control = True
    while(control == True):
        choice = raw_input("do you want to hit or stand? type 'hit' or 'stand' for your choices.")
        if(choice.lower() == 'hit'):
            playing = False
            control = False
            print "testing, hit selected bruv"
        elif(choice.lower() == 'stand'):
            playing = True
            control = False
            print "testing, stand selected bruv"
        else:
            print "Invalid input, please re-enter!"
            
def showSome(player, dealer):
    pass



# In[10]:


turgalo = Hand()
megika = Deck()
hitOrStand(megika, turgalo)

