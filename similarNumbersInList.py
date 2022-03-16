#Sanchez Torres Sergio Daniel
#Distributed Systems - Photon

#Function that receives 2 lists of integers and prints a list with 
#the numbers in common between the 2 received lists
def intersection(l1, l2):
    intersection = []

    #Loop to identify numbers in common
    for numbers1 in l1:
        for numbers2 in l2:
            if numbers1 == numbers2 and numbers1 not in intersection:
                intersection.append(numbers1)
    
    print(intersection)

#Hardcoding the 2 lists
list1 = [2,3,5,6,11]
list2 = [1,2,4,6,7,11]

#Calling the function
intersection(list1,list2)
