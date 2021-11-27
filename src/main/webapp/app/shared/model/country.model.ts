import { IRegion } from 'app/shared/model/region.model';

export interface ICountry {
  id?: string;
  countryName?: string | null;
  region?: IRegion | null;
}

export const defaultValue: Readonly<ICountry> = {};
