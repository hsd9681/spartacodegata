n, m = map(int, input().split())
list_num = list(map(int, input().split()))
max_sum = 0

for i in range(n):
    for j in range(i + 1, n):
        for k in range(j + 1, n):
            current_sum = list_num[i] + list_num[j] + list_num[k]
            if current_sum <= m:
                max_sum = max(max_sum, current_sum)

print(max_sum)