
# 가변형 인자를 전달 받아 가장 큰 값을 반환하는 함수를 정의하고,
 

# 다음과 같은 결과를 출력하는 프로그램을 작성하십시오


number = [3, 5, 4, 1, 8, 10, 2]

def maxi(x):
    x = list(map(int,x))
    print("max(3, 5, 4, 1, 8, 10, 2) => {0}".format(max(x)))

maxi(number)