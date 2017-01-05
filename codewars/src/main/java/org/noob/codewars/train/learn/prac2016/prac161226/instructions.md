If you reverse the word emirp you will have the word prime. That idea is related with the purpose of this kata. 

We should select all the primes that when reversed are a different prime. The palindromic primes should be discarded. 

For example: 13, 17 are prime numbers and the reversed respectively are 31, 71 which are also primes, so 13 and 17 are emirps 

But see the cases, 757, 787, 797, these are palindromic primes, with the special property that primes coincides with the reversed ones, 

so they do not enter in the sequence.

You should create a function find_emirp(), that receives one argument n, as an upper limit and the output should be an array with this structure:

[number of emirps bellow n, largest emirp smaller than n, sum of all the emirps of the sequence bellow n]

Let's some examples:

`find_emirp(10) -------> [0, 0, 0] # No emirps for this value of n`

 `find_emirp(50) -------> [4, 37, 98] # there are 4 emirps [13, 17, 31, 37]), the max. value is 37, and the sum = 13 + 17 + 31 + 37 = 98`
 
 `find_emirp(100) ------> [8, 97, 418] # there are 8 emirps [13, 17, 31, 37, 71, 73, 79, 97], 97 is the highest emirp for this range and the sum of all these 8 emirp primes is 418.`