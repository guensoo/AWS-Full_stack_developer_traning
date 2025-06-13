import axios from 'axios';
import { ClientID, ClientSecret } from '../constants/apiConfig';

export const searchBooks = async (query) => {
  const url = `https://openapi.naver.com/v1/search/book.json?query=${(query)}`;

  const headers = {
    'X-Naver-Client-Id': ClientID,
    'X-Naver-Client-Secret': ClientSecret,
  };

  const response = await axios.get(url, { headers });
  console.log(response.data)
  return response.data.items;
};