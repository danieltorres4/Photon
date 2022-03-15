def intersection(l1, l2):
    intersection = []

    for numbers1 in l1:
        for numbers2 in l2:
            if numbers1 == numbers2 and numbers1 not in intersection:
                intersection.append(numbers1)
    
    print(intersection)

list1 = [2,3,5,6,11]
list2 = [1,2,4,6,7,11]

intersection(list1,list2)
