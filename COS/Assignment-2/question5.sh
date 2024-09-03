#! /bin/bash
echo "Enter the number"
read num 
result=$(( $num % 2 ))

if [ $result -eq 0 ]
then
echo "$num is even number"
else
  echo "$num is odd number"
fi
