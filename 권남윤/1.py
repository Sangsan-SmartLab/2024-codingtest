import itertools

M = eval(input())
ans = input()
N = int(ans.split(" ")[0])
L = int(ans.split(" ")[1])

#위에 있는 코드는 건들지 말 것

num_list = []

nCr = itertools.combinations(M, N)
for j in nCr:
    sum_num = sum(j)

    if sum_num == L:
        num_list.append(j)

for num in num_list:
    print(num)
