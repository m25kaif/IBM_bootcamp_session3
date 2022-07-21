def calculator(option,a,b):
    a=int(a)
    b=int(b)
    if (option=="+"):
        print(a+b)
    elif (option=="-"):
        print(a-b)
    elif (option=="*"):
        print(a*b)
    elif (option=="/"):
        if (b!=0):
            print(a/b)
        else:
            print("not defined")
    else:
        print("wrong option")
        
option=input("Enter option")
a=input("Enter value of a: ")
b=input("Enter value of b: ")
calculator(option,a,b)



