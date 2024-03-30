"""
Clear list function clears the list..in the case that was mentioned by you,
it will result a list of empty lists 
because 'append' functions takes refferences as its arguments
not a new copy..
so the 'all' list will be a list of empty refrenced, cleared lists
"""


num=input ("Please enter a numer!")
num=int(num)
tables=range(1,num+1)
all=[]
# table=[]

for i in tables:
    n=range(1,i+1)
    table=[]
    for x in n:
        table.append(i*x)
    all.append(table)
    # table.clear()
print (all)
