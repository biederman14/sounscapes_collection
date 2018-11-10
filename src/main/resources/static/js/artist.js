class Artist {
	constructor() {}

	render() {
		return `
			<ul class="artistList">
				<li class="artistItem">Artist Name: ${artist.artistName}</li>
				<li class="artistImage">Artist Image: ${artist.artistImage}</li>
				<li class="artistHometown">Artist Home Town: ${artist.artistHometown}</li>
			</ul>
		`
	}	
}

module.exports = {
	Artist
}