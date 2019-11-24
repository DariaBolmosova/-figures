import sys
import socket

# Задаем адрес сервера
SERVER_ADDRESS = ('localhost', 8686)

# Настраиваем сокет
server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server_socket.bind(SERVER_ADDRESS)
server_socket.listen(1)
print('Ожидаем соединения')

# Слушаем запросы
connection, address = server_socket.accept()
print("Новое соединение {address}".format(address=address))
f_decoded = open('decoded.txt', 'w')
data = connection.recv(260)
print(data)
print("Данные записаны в файл decoded.txt")
f_decoded.write(str(data))
f_decoded.close()
connection.close()
