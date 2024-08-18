import sys
word_list = [list(sys.stdin.readline().rstrip()) for _ in range(5)]
cnt = 0
while True:
    if cnt == len(word_list):
        cnt = 0
        continue
    elif len(word_list[cnt]) > 0:
        print(word_list[cnt].pop(0), end="")
        cnt = cnt + 1
        continue
    elif len(word_list[0]) == 0 and len(word_list[1]) == 0 and \
            len(word_list[2]) == 0 and len(word_list[3]) == 0 and len(word_list[4]) == 0:
                break
    elif len(word_list[cnt]) == 0:
        cnt = cnt + 1
        continue