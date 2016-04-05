#TODO

##Planning
- Letters are grid with coordinates containing a-z
- To find words, we have a current letter and then check at all surrounding ones [(x-1,y+1),(x,y-1),(x+1,y-1), etc.]
  - Potentially, if there's an error checking coordinates that don't exist, just increase the x and y of the board 
    by 2 so that there's a border of blank spaces around all of letters
- This would allow size of board to be fairly modular
  - for all x and y of board, check for words at each surrounding, when a letter/word is used remove it from the list of usable
  - For this we need to make a "usable letters" list of coordinates
  - You would have to check if coordinate has been used when checking it 
- Do we check all words in the Linux system dictionary?
- How do we check how "rare" a word is?
  - words can have a listed rarity value and we just compare them
  - compare words by point value to find maximum point value based on length and rarity 
- Can we use a pre-built boggle dictionary with rarity?
