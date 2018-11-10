const {artistName} = require('.artist')

//Imported Components



//App Components



//Imported Tools




//Build App




//Boostrap Application




//Artists
function APIRequest(getArtists) {
const getArtists = () => {

	fetch('/api/artists')
	.then((res)=>res.json())
	.then((data)=>{
		let output='<button class ="btn">Artist<button>';
		data.forEach(function(artist){
			output += {artistName}
		})
	})}

document.querySelector('getArtists').addEventListener('click', getArtists);
}

// const artist = {
// 	artistName: 
// 	artistImage:
// 	artistHometown:
// }

// module.export = {
// 	getArtists()
// 	}

//Albums


//Songs