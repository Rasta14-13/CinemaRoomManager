# Cinema Room Manager


## About 

In this project, created an application that helps manage a cinema theatre: sell tickets, check available seats, see sales statistics, and more.

Menu looks like this:
```
1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
```

When the item `Statistics` is chosen, program prints the following information:

* The number of purchased tickets;
* The number of purchased tickets represented as a percentage. Percentages should be rounded to 2 decimal places;
* Current income;
* The total income that shows how much money the theatre will get if all the tickets are sold.

If a user chooses an already taken seat, print `That ticket has already been purchased!` and ask them to enter different seat coordinates until they pick an available seat.

If coordinates are out of bounds, print `Wrong input!` and ask to enter different seat coordinates until the user picks an available seat.

## Examples

```
Enter the number of rows:
> 6
Enter the number of seats in each row:
> 6

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 3

Number of purchased tickets: 0
Percentage: 0.00%
Current income: $0
Total income: $360

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 2

Enter a row number:
> 1
Enter a seat number in that row:
> 1

Ticket price: $10

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 3

Number of purchased tickets: 1
Percentage: 2.78%
Current income: $10
Total income: $360

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 2

Enter a row number:
> 1
Enter a seat number in that row:
> 1

That ticket has already been purchased!

Enter a row number:
> 10
Enter a seat number in that row:
> 20

Wrong input!

Enter a row number:
> 4
Enter a seat number in that row:
> 4

Ticket price: $10

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 1

Cinema:
  1 2 3 4 5 6
1 B S S S S S
2 S S S S S S
3 S S S S S S
4 S S S B S S
5 S S S S S S
6 S S S S S S

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 3

Number of purchased tickets: 2
Percentage: 5.56%
Current income: $20
Total income: $360

1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit
> 0
```
