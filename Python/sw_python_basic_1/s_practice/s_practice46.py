
# "ADCBBBBCABBCBDACBDCAACDDDCAABABDBCBCBDBDBDDABBAAAAAAADADBDBCBDABADCADC"와

# 같은 문자열이 주어지고, A는 4점, B는 3점, C는 2점, D는 1점이라고 할 때 문자열에 사용된

# 알파벳 점수의 총합을 map 함수와 람다식을 이용해 구하십시오

abc =  "ADCBBBBCABBCBDACBDCAACDDDCAABABDBCBCBDBDBDDABBAAAAAAADADBDBCBDABADCADC"
abc1 = list(abc)
sum = 0
lambda x : sum+=4 if x == 'A' else(sum += 3 if x == 'B')
