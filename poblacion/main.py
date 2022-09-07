from opcode import opname
import worldometer
import os
import json
poblacion= worldometer.current_world_population()
jsonPoblacion=json.dumps(poblacion)
print( jsonPoblacion)
file=open("./poblacion.json", "w")
file.write(jsonPoblacion)
file.close()
