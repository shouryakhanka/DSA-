# wap in python that accepts length of three sides of a triangle as input the program should indicate whether or not the triangle is right angled and calculate area and perimeter

print("Input three integers(sides of a triangle)")
int_num = list(map(int,input().split()))
x,y,z = sorted(int_num)
if x**2+y**2==z**2:
    print('Yes')
else:
    print('No')

    s = (x + y + z) / 2  
  
# calculate the area  
area = (s*(s-x)*(s-y)*(s-z)) ** 0.5  
print('The area of the triangle is %0.2f' %area)   

perimeter = x + y + z
print('The area of the triangle is %0.2f' %perimeter)   