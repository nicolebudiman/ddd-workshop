##DDD Training 10 - 11 September 2021

###Problem#2: 
Add a “Hero ink Pen” to a cart

###Problem#3: 
Add 2 quantities of “GM Cricket bat” to a cart.

###Problem#4: 
Remove already added Item “IPad Pro”( all quantities) from the cart.

###Problem#5: 
As a business User I would like to know which Products (name) were deleted from Cart.

###Problem#6: 
As a business User, I would like to differentiate between two Carts.

###Problem#7: 
See the Price of Product before adding to a Cart

Notes: Java.Util.Currency ==> Currency.getInstance("USD")

###Problem #8:
As a Business User I will like price my product 10% below competitor price (competitor price is available for product) . 
Assume that HashMap of Competitor Product Name and price are available.

###Problem #9:
Create Order( with Products) when Cart is checked out. Also Mark cart as checked out 

###Problem #10: Customer and Bank Account
When Customer’s Address is updated, update her all Bank Accounts address as well. (example of invariant or business rules or consistency rules)
- Customer is Entity
- Account Is Entity
- Customer has List of bank accounts
- Customer has Address
- Account has Address
- Address has one attribute called City
- Address is Value Object
- customer updateAddress(address)

###Problem #11 - Calculate Total amount for the Order.  put shipping cost as per weight
Total cost = cost of all products in order + (weightIngrams of each product *.01)