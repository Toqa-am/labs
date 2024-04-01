from math import pi,pow
area=0
shape=input("Please enter r/c/s/t \n")
if shape=='r':
    hight=input("Please enter hight \n")
    width=input("Please enter width \n")
    arg=width,hight

elif shape=='t':
    base=input("Please enter base \n")
    hight=input("Please enter hight \n")
    arg=base,hight
elif shape=='s':
    hight=input("Please enter hight \n")
    arg=hight

elif shape=='c':
    radius=input("Please enter radius \n")
    arg=radius


def calcarea(name,args):
    f1=open("result.txt","w")

    if name=='r':
    
        area=int(args[0])*int(args[1])
        f1.write("Shape: Rectangle \n")
        
        f1.write("Hight: "+str(args[0])+"\nWidth: "+str(args[1])+"\nArea: "+str(area))
        

    elif name=='s':
        area=int(args[0])*int(args[0])
        f1.write("Shape: Rectangle \n")
        f1.write("Hight: "+str(args[0])+"\nArea: "+str(area))

        
    elif name=='t':
        area=int(args[0])*1/2*int(args[1])
        f1.write("Shape: Triangle \n")
        f1.write("1/2 Base: "+str(args[0])+"\nHight: "+str(args[1])+"\nArea: "+str(area))


    elif name=='c':
        area=int(args[0])*int(args[0])*pi
        f1.write("Shape: Circle \n")
        f1.write("Radius: "+str(args[0])+"\nArea: "+str(area))

    else:
        print("you didn't enter a proper shape \n")
    
    f1.close()




calcarea(shape,arg)