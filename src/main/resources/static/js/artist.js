function listArtist(jsonArray){
	const artists = document.createElement('artists');
	jsonArray.forEach(elem => {
		artists.innerHTML += `
		<h2 id="${elem.name}" data-artistId="$elem.id">
			${elem.name}
		</h2>
		`

		artists.querySelector()
	})
	document.body.innerHTML += main.innerHTML
}

function getAlbums() {
	const hTwo = document.querySelectorAll('.artist')
	hTwo.forEach(() => {

	})
}

module.exports = {
	listArtist
}