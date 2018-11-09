
const {getArtist} = require ('../js/artist')

describe('should access artist.js file', () =>{
	beforeEach(() => {
		fetch.resetMocks()
	})

	test('getArtist is defined', () => {
		expect(getArtist).toBeDefined()
	})
})


// describe('getArtists', () => {
// 	beforeEach(() => {
// 		fetch.resetMocks()
// 	})

// 	test('lists all artists', () => {
// 		fetch.mockResponseOnce(
// 			JSON.stringify({
// 				artistName: 'Phil Collins'
// 			}))
// 	})
// })