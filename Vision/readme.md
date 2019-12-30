Распознавание номеров машин:
curl -k -v "https://smarty.mail.ru/api/v1/objects/detect?oauth_provider=mcs&oauth_token=kuTFKawJVjTerHQZz64BJRMvKLenVYVNHhrnHL8XwXcuk9Xrc" -F "file_0=@1.jpg" -F "file_1=@2.jpg" -F meta='{"mode":["car_number"],"images":[{"name":"file_1"},{"name":"file_0"}]}'

Распознавание персон на фотографии:
curl -k -v "https://smarty.mail.ru/api/v1/persons/recognize?oauth_provider=mcs&oauth_token=kuTFKawJVjTerHQZz64BJRMvKLenVYVNHhrnHL8XwXcuk9Xrc" -F "file_0=@friend1.jpg" -F meta='{"images":{"name":"file_0"}, "space":"1"}'

Добавление персоны в базу в определенный space:
curl -k -v "https://smarty.mail.ru/api/v1/persons/set?oauth_provider=mcs&oauth_token=kuTFKawJVjTerHQZz64BJRMvKLenVYVNHhrnHL8XwXcuk9Xrc" -F "file_0=@rachel-green.jpg" -F meta='{"person_id":1}, "space":"1"}'

Удаление персоны из базы:
curl -k -v "https://smarty.mail.ru/api/v1/persons/delete?oauth_provider=mcs&oauth_token=kuTFKawJVjTerHQZz64BJRMvKLenVYVNHhrnHL8XwXcuk9Xrc" -F meta='{"images":{"person_id":1}, "space":"1"}'
