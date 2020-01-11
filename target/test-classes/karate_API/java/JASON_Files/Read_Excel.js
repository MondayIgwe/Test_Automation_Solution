//Read a file
var workbook = new Excel.Workbook();
workbook.xlsx.readFile("data.xlsx").then(function () {

//Get sheet by Name
var worksheet=workbook.getWorksheet('Sheet1');

//Get Lastrow
var row = worksheet.lastRow

//Update a cell
row.getCell(1).value = 5;

row.commit();

//Save the workbook
return workbook.xlsx.writeFile("data.xlsx");

});