students = [
     {'first_name':  'Michael', 'last_name' : 'Jordan'},
     {'first_name' : 'John', 'last_name' : 'Rosales'},
     {'first_name' : 'Mark', 'last_name' : 'Guillen'},
     {'first_name' : 'KB', 'last_name' : 'Tonel'}
]

# for i in range(len(students)):
#      print(students[i]['first_name'], students[i]['last_name'])


# def firstLast(list):
#     i=0
#     while i<len(list):
#         print(list[i]['first_name'], list[i]['last_name'])
        # for val in list[i].values():
        #     print(val)
            # print(val['first_name'] + val['last_name'])
        # i +=1

def firstLast(list):
    for i in range(len(students)):
      print(students[i]['first_name'], students[i]['last_name'])




firstLast(students)

