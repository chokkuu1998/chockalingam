var startDate = new Date('Jan 01 2007 11:00:00');
var endDate = new Date('Jan 01 2007 11:30:00');
var starthour = parseInt(startDate.getHours());
var endhour = parseInt(endDate.getHours());

if(starthour>endhour){
    alert('Hours diff:' + parseInt(starthour-endhour));
}
else{
    alert('Hours diff:' + parseInt(endhour-starthour));
}
