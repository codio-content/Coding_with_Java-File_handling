// Load the file system library
fs = require('fs')             

// Get the filepath from the command line
var P= process.argv[2] 
var F= process.argv[3]
var L= process.argv[4]
var B= process.argv[5]

// Your code goes here
var data= fs.readFileSync(P, 'utf8')

// Create a list of all the records
var recordList= []
while(data.length > 0){
  var record= []
  record[0]= data.substring(0,16)
  record[1]= data.substring(16,32)
  record[2]= data.substring(32,40)
  recordList.push(record)
  data= data.substring(40)
}
console.log(recordList);

// Find the matching name
var output= ''
for(var i=0; i < recordList.length; i++){
  var thisRecord= recordList[i]
  if(thisRecord[0].trim() == F && thisRecord[1].trim() == L){
    thisRecord[2]= B
  }
  output+= thisRecord[0] + thisRecord[1] + thisRecord[2]
}

// Write out the finished string to our file P
fs.writeFileSync(P, output, 'utf8')
