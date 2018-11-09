
const {HomeWrapper} = require('./home\Wrapper')
const {header} = require('.header')


//Imported Components



//App Components



//Imported Tools




//Build App




//Boostrap Application




//Artists
const getArtists = () => {

	fetch('/api/artists')
	.then((res)=>res.json())
	.then((data)=>{
		let output='<button class ="btn">Artist<button>';
		data.forEach(function(artist){
			output += `
			<ul class="artistList">
				<li class="artistItem">Artist Name: ${artist.artistName}</li>
				<li class="artistImage">Artist Image: ${artist.artistImage}</li>
				<li class="artistHometown">Artist Home Town: ${artist.artistHometown}</li>
			</ul>
			`
		})
	})}

document.querySelector('getArtists').addEventListener('click', getArtists);

const artist = {
	artistName: 
	artistImage:
	artistHometown:
}

module.export = {
	getArtists()
	}

//Albums


//Songs