# BridgeLabzFellowshipPrograms
                                          Functional Programs 
                                          
1. User Input and Replace String Template “Hello <<UserName>>, How are you?” 
  a. I/P ­> Take User Name as Input. Ensure UserName has min 3 char b. Logic ­> Replace <<UserName>> with the proper name c. O/P ­> Print the String with User Name 
2. Flip Coin and print percentage of Heads and Tails 
  a. I/P ­> The number of times to Flip Coin. Ensure it is positive integer . b. Logic ­> Use Random Function to get value between 0 and 1. If < 0.5 then tails or 
  heads c. O/P ­> Percentage of Head vs Tails 
3. Leap Year 
  a. I/P ­> Year, ensure it is a 4 digit number. b. Logic ­> Determine if it is a Leap Year. c. O/P ­> Print the year is a Leap Year or not. 
4. Power of 2 
  a. Desc ­> This program takes a command­line argument N and prints a table of the 
  powers of 2 that are less than or equal to 2^N. b. I/P ­> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int c. Logic ­> repeat until i equals N. d. O/P ­> Print the year is a Leap Year or not. 
5. Harmonic Number 
a. Desc ­> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N 
  (http://users.encs.concordia.ca/~chvatal/notes/harmonic.html). b. I/P ­> The Harmonic Value N. Ensure N != 0 c. Logic ­> compute 1/1 + 1/2 + 1/3 + ... + 1/N d. O/P ­> Print the Nth Harmonic Value. 
6. Factors 
  a. Desc ­> Computes the prime factorization of N using brute force. b. I/P ­> Number to find the prime factors c. Logic ­> Traverse till i*i <= N instead of i <= N for efficiency . d. O/P ­> Print the prime factors of number N. 
 
7. Gambler 
  a. Desc ­> Simulates a gambler who start with $stake and place fair $1 bets until 
  he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of times he/she wins and the number of bets he/she makes. Run the experiment N times, averages the results, and prints them out. b. I/P ­> $Stake, $Goal and Number of times c. Logic ­> Play till the gambler is broke or has won d. O/P ­> Print Number of Wins and Percentage of Win and Loss. 
8. Coupon Numbers 
  a. Desc ­> Given N distinct Coupon Numbers, how many random numbers do you need to generate distinct coupon number? This program simulates this random process. b. I/P ­> N Distinct Coupon Number c. Logic ­> repeatedly choose a random number and check whether it's a new one. d. O/P ­> total random number needed to have all distinct numbers. e. Functions => Write Class Static Functions to generate random number and to 
  process distinct coupons. 
9. 2D Array 
  a. Desc ­> A library for reading in 2D arrays of integers, doubles, or booleans from 
  standard input and printing them out to standard output. b. I/P ­> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class c. Logic ­> create 2 dimensional array in memory to read in M rows and N cols d. O/P ­> Print function to print 2 Dimensional Array. In Java use PrintWriter with 
  OutputStreamWriter to print the output to the screen. 
10. Sum of three Integer adds to ZERO 
  a. Desc ­> A program with cubic running time. Read in N integers and counts the 
  number of triples that sum to exactly 0. b. I/P ­> N number of integer, and N integer input array c. Logic ­> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0 d. O/P ­> One Output is number of distinct triplets as well as the second output is to 
  print the distinct triplets. 11. Write a program Distance.java that takes two integer command­line arguments x and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function 
12.Write static functions to return all permutation of a String using iterative method and Recursion method. Check if the arrays returned by two string functions are equal. 
   Note : the formula is not valid if t is larger than 50 in absolute value or if v is larger than 120 or less than 3 (you may assume that the values you get are in that range). 
13. Simulate Stopwatch Program 
  a. Desc ­> Write a Stopwatch Program for measuring the time that elapses between 
  the start and end clicks b. I/P ­> Start the Stopwatch and End the Stopwatch c. Logic ­> Measure the elapsed time between start and end d. O/P ­> Print the elapsed time. 
14. Cross Game or Tic­Tac­Toe Game 
  a. Desc ­> Write a Program to play a Cross Game or Tic­Tac­Toe Game. Player 1 is 
  the Computer and the Player 2 is the user. Player 1 take Random Cell that is the Column and Row. b. I/P ­> Take User Input for the Cell i.e. Col and Row to Mark the ‘X’ c. Logic ­> The User or the Computer can only take the unoccupied cell. The Game 
  is played till either wins or till draw... d. O/P ­> Print the Col and the Cell after every step. e. Hint ­> The Hints is provided in the Logic. Use Functions for the Logic... 15.Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c. Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula 
  delta = b*b ­ 4*a*c 
  Root 1 of x = (­b + sqrt(delta))/(2*a) 
  Root 2 of x = (­b ­ sqrt(delta))/(2*a) 
  Take a, b and c as input values to find the roots of x. 
16. Write a program WindChill.java that takes two double command­line arguments t 
  and v and prints the wind chill. Use Math.pow(a, b) to compute ab. 
  Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the National Weather Service defines the effective temperature (the wind chill) to be: 
                                      
                                      Algorithm Programs 
                                      
    IMPORTANT NOTE ­ Create a Util Class and write the Anagram, Palindrome, Prime Numbers, Search Algos, Sort Algos, etc as a static function 
1. An Anagram Detection Example 
  a. Desc ­> One string is an anagram of another if the second is simply a 
  rearrangement of the first. For example, 'heart' and 'earth' are anagrams... b. I/P ­> Take 2 Strings as Input such abcd and dcba and Check for Anagrams c. O/P ­> The Two Strings are Anagram or not.... 
2. Take a range of 0 ­ 1000 Numbers and find the Prime numbers in that range. 
3. Extend the above program to find the prime numbers that are Anagram and Palindrome 
4. To the Utility Class write the following static methods 
  a. Desc ­> Create Utility Class having following static methods 
  i. binarySearch method for integer ii. binarySearch method for String iii. insertionSort method for integer iv. insertionSort method for String v. bubbleSort method for integer vi. bubbleSort method for String 
  b. I/P ­> Write main function to call the utility function c. Logic ­> Check using Stopwatch the Elapsed Time for every method call d. O/P ­> Output the Search and Sorted List. More importantly print elapsed time 
  performance in descending order 
5. Question to find your number 
  a. Desc ­> takes a command­line argument N, asks you to think of a number 
  between 0 and N­1, where N = 2^n, and always guesses the answer with n questions. b. I/P ­> the Number N and then recursively ask true/false if the number is between 
  a high and low value c. Logic ­> Use Binary Search to find the number d. O/P ­> Print the intermediary number and the final answer 
6. Binary Search the Word from Word List 
  a. Desc ­> Read in a list of words from File. Then prompt the user to enter a word to 
  search the list. The program reports if the search word is found in the list. b. I/P ­> read in the list words comma separated from a File and then enter the word 
  to be searched c. Logic ­> Use Arrays to sort the word list and then do the binary search d. O/P ­> Print the result if the word is found or not 
7. Insertion Sort 
  a. Desc ­> Reads in strings from standard input and prints them in sorted order. 
Uses insertion sort. b. I/P ­> read in the list words c. Logic ­> Use Insertion Sort to sort the words in the String array d. O/P ­> Print the Sorted List 
8. Bubble Sort 
  a. Desc ­> Reads in integers prints them in sorted order using Bubble Sort b. I/P ­> read in the list ints c. O/P ­> Print the Sorted List 
9. Merge Sort ­ Write a program with Static Functions to do Merge Sort of list of 
  Strings. a. Logic ­> To Merge Sort an array, we divide it into two halves, sort the two halves 
  independently, and then merge the results to sort the full array. To sort a[lo, hi), we use the following recursive strategy: b. Base case: If the subarray length is 0 or 1, it is already sorted. c. Reduction step: Otherwise, compute mid = lo + (hi ­ lo) / 2, recursively sort the 
  two subarrays a[lo, mid) and a[mid, hi), and merge them to produce a sorted result. 
10. Find the Fewest Notes to be returned for Vending Machine 
  a. Desc ­> There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be 
  returned by Vending Machine. Write a Program to calculate the minimum number of Notes as well as the Notes to be returned by the Vending Machine as a Change b. I/P ­> read the Change in Rs to be returned by the Vending Machine c. Logic ­> Use Recursion and check for largest value of the Note to return change 
  to get to minimum number of Notes. 
  d. O/P ­> Two Outputs ­ one the number of minimum Note needed to give the 
  change and second list of Rs Notes that would given in the Change 11. To the Util Class add dayOfWeek static function that takes a date as input and prints the day of the week that date falls on. Your program should take three command­line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division): 
  y 0 = y − (14 − m ) / 12 x = y 0 + y 0 /4 − y 0 /100 + y 0 /400 m 0 = m + 12 × ((14 − m ) / 12) − 2 d 0 = ( d + x + 31 m 0 / 12) mod 7 12. To the Util Class add temperaturConversion static function, given the temperature in fahrenheit as input outputs the temperature in Celsius or viceversa using the formula 
  Celsius to Fahrenheit: (°C × 9/5) + 32 = °F 
  Fahrenheit to Celsius: (°F − 32) x 5/9 = °C 
13. Write a Util Static Function to calculate monthlyPayment that reads in three command­line arguments P, Y, and R and calculates the monthly payments you would have to make over Y years to pay off a P principal loan amount at R per cent interest compounded monthly. The formula is The formula is 
14. Write a static function sqrt to compute the square root of a nonnegative number c 
  given in the input using Newton's method: 
  ­ initialize t = c 
  ­ replace t with the average of c/t and t 
  ­ repeat until desired accuracy reached using condition Math.abs(t ­ c/t) > epsilon*t where epsilon = 1e­15 ; 
15. Write a static function toBinary that outputs the binary (base 2) representation of the decimal number typed as the input. It is based on decomposing the number into a sum of powers of 2. For example, the binary representation of 106 is 11010102, 
  which is the same as saying that 106 = 64 + 32 + 8 + 2. Ensure necessary padding to represent 4 Byte String. 
  To compute the binary representation of n, we consider the powers of 2 less than or equal to n in decreasing order to determine which belong in the binary decomposition (and therefore correspond to a 1 bit in the binary representation). 
16. Write Binary.java to read an integer as an Input, convert to Binary using toBinary 
function and perform the following functions. 
  i. Swap nibbles and find the new number. 
  ii. Find the resultant number is the number is a power of 2. 
  A nibble is a four­bit aggregation, or half an octet. There are two nibbles in a byte. 
  Given a byte, swap the two nibbles in it. For example 100 is to be represented as 01100100 in a byte (or 8 bits). The two nibbles are (0110) and (0100). If we swap the two nibbles, we get 01000110 which is 70 in decimal. 
