ls
touch somefile.txt
echo "test data" > somefile.txt
data=$(cat somefile.txt)
echo ${data}
echo "data=$(echo ${data})" >> env.sh