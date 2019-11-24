# !/usr/bin/env python
# -*- coding: utf-8 -*-

import socket

MAX_CONNECTIONS = 10
address_to_server = ('localhost', 8686)


client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect(address_to_server)
print("введите строку для передачи и нажмите Enter, строка ограничена 260 символов")

message = input()
print(bytes(message, encoding='UTF-8'))
client.send(bytes(message, encoding='UTF-8'))


data = client.recv(260)
print(str(data))

