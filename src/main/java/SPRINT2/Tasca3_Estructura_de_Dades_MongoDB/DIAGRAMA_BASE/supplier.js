db.createCollection('supplier', {validator: {$jsonSchema: {bsonType: 'object',title: 'supplier',required: ['name','address_street','address_num','address_city','address_zip','address_country','phone','nif'],properties:{name:{bsonType: 'string'},address_street:{bsonType: 'string'},address_num:{bsonType: 'int'},address_apt:{bsonType: 'string'},address_city:{bsonType: 'string'},address_zip:{bsonType: 'int'},address_country:{bsonType: 'string'},phone:{bsonType: 'string'},fax:{bsonType: 'string'},nif:{bsonType: 'string'}}}},autoIndexId: true});