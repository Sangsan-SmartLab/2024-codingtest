from itertools import combinations

M = eval(input())
N, L = map(int, input().split())

num_list = [comb for comb in combinations(M, N) if sum(comb) == L]

for num in num_list:
    print(num)
